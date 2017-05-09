package kontinuum.model

data class StageInfo(val stage: String,
                     val startEpochSeconds: Long,
                     val endEpochSeconds: Long,
                     var status: StageStatus,
                     var info: String)
