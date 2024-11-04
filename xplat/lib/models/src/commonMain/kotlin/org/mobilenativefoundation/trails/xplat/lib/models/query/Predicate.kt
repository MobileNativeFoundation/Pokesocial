package org.mobilenativefoundation.trails.xplat.lib.models.query

import kotlinx.serialization.Contextual
import kotlinx.serialization.Serializable

@Serializable

sealed class Predicate< out T : @Contextual Any> {
    @Serializable
    data class Comparison<T : @Contextual Any>(
        val propertyName: String,
        val operator: ComparisonOperator,
        val value: @Contextual T,
        val valuePropertyValueType: PropertyValueType
    ) : Predicate<T>()

    @Serializable
    data class Logical<T : Any>(
        val operator: LogicalOperator,
        val predicates: List<Predicate<T>>
    ) : Predicate<T>()
}

enum class PropertyValueType {
    STRING, BOOLEAN, INT, LONG
}

