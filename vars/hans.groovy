import nl.kadaster.jenkins.system.Print ; 


def call(String name = 'hans') {
    // Any valid steps can be called from this code, just like in other
    // Scripted Pipeline
    def print = new Print()
    print.str ("Hello, ${name}")
}
