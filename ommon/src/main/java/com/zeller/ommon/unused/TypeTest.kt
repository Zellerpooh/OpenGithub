package com.zeller.ommon.unused

interface Book

interface EduBook : Book

class BookStore<out T : Book> {
    fun getBook(): T {
        TODO()
    }

}

/**
 * 协变 BookStore<Book> 是BookStore<EduBook>的父类
 * 子类可以替代父类,所以可以从eduBookStore中取Book()
 * 父类不能替代子类,所以不能从bookStore中取eduBook()
 */
fun covariant() {
    val eduBookStore: BookStore<EduBook> = BookStore()
    val bookStore: BookStore<Book> = eduBookStore

    val book: Book = bookStore.getBook()

    val eduBook: EduBook = eduBookStore.getBook()
}

open class Waste

class DryWaste : Waste()

class Dustbin<in T : Waste> {
    fun put(waste: T) {

    }
}

/**
 * 逆变 Dustbin<DryWaste>是Dustbin<Waste>的父类
 * 子类可以替代父类,所以dustbin可以消费waste和dryWaste
 */
fun wasteSorting() {
    val dustbin: Dustbin<Waste> = Dustbin<Waste>()
    val dryWasteDustbin: Dustbin<DryWaste> = dustbin

    val waste = Waste()
    val dryWaste = DryWaste()

    dustbin.put(waste)
    dustbin.put(dryWaste)

//    dryWasteDustbin.put(waste)
    dryWasteDustbin.put(dryWaste)
}