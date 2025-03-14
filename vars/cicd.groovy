def GitDownload(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git"
}

def MavenBuild()
{
  sh 'mvn package'
}
def depoy(jobname, ipaddress, context_path)
{
  sh 'scp -i /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat10/webapps/${context_path}.war'
}
