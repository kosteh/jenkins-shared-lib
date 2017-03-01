package nl.kadaster.jenkins.system

class SerializablePrint implements Serializable {
    def lastLine
    SerializablePrint() {this.lastLine = ""}
    def line (String line) {
        lastLine = "${lastLine}\n${line}"
        echo "${lastLine}"
    }
}
