package org.mobilenativefoundation.trails.xplat.lib.repositories.post.impl.store.models

import org.mobilenativefoundation.trails.xplat.lib.models.post.Post

sealed class PostOutput {
    data class Keys(val values: List<Post.Key>): PostOutput()
    data class Key(val value: Post.Key): PostOutput()
    data class Single(val value: Post) : PostOutput()
    data class Collection(val values: List<Post>) : PostOutput()
}