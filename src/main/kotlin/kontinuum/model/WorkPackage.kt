package kontinuum.model

data class WorkPackage(val project: String,
                       val commitHash: String,
                       val epochSeconds: Long,
                       var commitMessage: String? = null,
                       var branch: String? = null,
                       var workPackageStatus: WorkPackageStatus,
                       var stageInfoList: MutableList<StageInfo> = mutableListOf())
