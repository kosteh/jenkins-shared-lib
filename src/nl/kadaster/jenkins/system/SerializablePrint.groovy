package nl.kadaster.jenkins.system

class SerializablePrint implements Serializable {
    def lastLine
    def steps
    SerializablePrint(steps) {this.lastLine = ""; this.steps = steps }
    def line (String line) {
        lastLine = "${lastLine}\n${line}"
        steps.echo "${lastLine}"
    }
}
