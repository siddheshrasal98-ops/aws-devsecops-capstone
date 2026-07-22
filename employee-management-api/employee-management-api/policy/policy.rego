package devsecops

default allow := true

deny contains msg if {
    input.environment == "production"
    not input.approved
    msg := "Deployment to production requires approval"
}