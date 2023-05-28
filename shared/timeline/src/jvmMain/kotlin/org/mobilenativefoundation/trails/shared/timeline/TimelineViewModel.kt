package org.mobilenativefoundation.trails.shared.timeline

import kotlinx.coroutines.CoroutineScope
import org.mobilenativefoundation.trails.shared.data.entity.PostOverview
import org.mobilenativefoundation.trails.shared.paging.core.Pager

actual class TimelineViewModel(
    coroutineScope: CoroutineScope,
    pager: Pager<Int, PostOverview, PostOverview>
) {
    private val delegate = TimelineViewModelDelegate(coroutineScope, pager)
    actual fun onLoadMore() = delegate.onLoadMore()
    actual val state = pager.state
}