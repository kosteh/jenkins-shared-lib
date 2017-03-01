import nl.kadaster.jenkins.system.SerializablePrint


def call(String name = 'hans') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    def print = new SerializablePrint(this)
    print.line ("${name}")
}
