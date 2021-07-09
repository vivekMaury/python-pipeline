import jenkins.model.Jenkins

hudson.model.Hudson.instance.getView('<ViewName>').items.each() {
    println it.fullDisplayName
def jobname=it.fullDisplayName
def item = hudson.model.Hudson.instance.getItem(jobname)
def build = item.getLastBuild()
if (item.getLastBuild() !=null){
    
    Jenkins.instance.getItemByFullName(jobname).builds.findAll { it.number <= 5 }.each { it.delete() }

}
}
