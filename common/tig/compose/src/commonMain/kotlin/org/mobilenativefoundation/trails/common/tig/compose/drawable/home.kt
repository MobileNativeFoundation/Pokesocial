package org.mobilenativefoundation.trails.common.tig.compose.drawable

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import trails.common.tig.compose.generated.resources.Res
import trails.common.tig.compose.generated.resources.home

@OptIn(ExperimentalResourceApi::class)
val homeIcon: Painter
    @Composable
    get() = painterResource(Res.drawable.home)