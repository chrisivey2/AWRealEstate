package com.example.data.network.duck


import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("attribution")
    val attribution: Any? = Any(),
    @SerializedName("blockgroup")
    val blockgroup: Any? = Any(),
    @SerializedName("created_date")
    val createdDate: Any? = Any(),
    @SerializedName("description")
    val description: String? = "",
    @SerializedName("designer")
    val designer: Any? = Any(),
    @SerializedName("dev_date")
    val devDate: Any? = Any(),
    @SerializedName("dev_milestone")
    val devMilestone: String? = "",
    @SerializedName("developer")
    val developer: List<Developer?>? = listOf(),
    @SerializedName("example_query")
    val exampleQuery: String? = "",
    @SerializedName("id")
    val id: String? = "",
    @SerializedName("is_stackexchange")
    val isStackexchange: Any? = Any(),
    @SerializedName("js_callback_name")
    val jsCallbackName: String? = "",
    @SerializedName("live_date")
    val liveDate: Any? = Any(),
    @SerializedName("maintainer")
    val maintainer: Maintainer? = Maintainer(),
    @SerializedName("name")
    val name: String? = "",
    @SerializedName("perl_module")
    val perlModule: String? = "",
    @SerializedName("producer")
    val producer: Any? = Any(),
    @SerializedName("production_state")
    val productionState: String? = "",
    @SerializedName("repo")
    val repo: String? = "",
    @SerializedName("signal_from")
    val signalFrom: String? = "",
    @SerializedName("src_domain")
    val srcDomain: String? = "",
    @SerializedName("src_id")
    val srcId: Int? = 0,
    @SerializedName("src_name")
    val srcName: String? = "",
    @SerializedName("src_options")
    val srcOptions: SrcOptions? = SrcOptions(),
    @SerializedName("src_url")
    val srcUrl: Any? = Any(),
    @SerializedName("status")
    val status: String? = "",
    @SerializedName("tab")
    val tab: String? = "",
    @SerializedName("topic")
    val topic: List<String?>? = listOf(),
    @SerializedName("unsafe")
    val unsafe: Int? = 0
)