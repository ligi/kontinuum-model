package kontinuum.model

data class StageInfo(val stage: String,
                     var status: StageStatus,
                     var info: String,
                     val startEpochSeconds: Long,
                     var endEpochSeconds: Long? = null)
