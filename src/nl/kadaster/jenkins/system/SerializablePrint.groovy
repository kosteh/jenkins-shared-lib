package nl.kadaster.jenkins.system

class SerializablePrint implements Serializable {
    def lastLine = ""
    SerializablePrint(line) {this.lastLine = line}
    def line (String line) {
        lastLine = "${lastLine}\n${line}"
        echo "${lastLine}"
    }
}
