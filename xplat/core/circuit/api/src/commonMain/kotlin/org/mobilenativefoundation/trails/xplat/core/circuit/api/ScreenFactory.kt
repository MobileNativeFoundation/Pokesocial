package org.mobilenativefoundation.trails.xplat.core.circuit.api

import org.mobilenativefoundation.trails.xplat.feat.homeScreen.api.HomeScreen
import org.mobilenativefoundation.trails.xplat.feat.messagesScreen.api.MessagesScreen
import org.mobilenativefoundation.trails.xplat.feat.searchScreen.api.SearchScreen

interface ScreenFactory {
    fun homeScreen(): HomeScreen
    fun messagesScreen(): MessagesScreen
    fun searchScreen(): SearchScreen
}