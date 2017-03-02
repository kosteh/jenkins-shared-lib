class jenkinsInfra implements Serializable {
    private String teams = 'BAG\nBGT\nGVF\nVBP\nVBT'
    def getTeams(value) {
        teams
    }
    
    def printTeams (steps) {
        steps.echo "${teams}"
    }
}
