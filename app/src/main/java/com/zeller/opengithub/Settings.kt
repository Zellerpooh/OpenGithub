package com.zeller.opengithub

import com.zeller.ommon.sharedpreferences.Preference
import com.zeller.opengithub.ui.AppContext

object Settings {

    var username: String by Preference(AppContext, "username", "")
    var password: String by Preference(AppContext, "password", "")
}