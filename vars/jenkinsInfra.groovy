class jenkinsInfra implements Serializable {
    private String teams = 'BAG\nBGT\nVBP\nVBT'
    def getTeams(value) {
        teams
    }
    
    def printTeams (steps) {
        steps.echo "${teams}"
    }
}
