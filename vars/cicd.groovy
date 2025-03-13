def GitDownload(repo)
{
  git "https://github.com/IntelliqDevops/${repo}.git"
}

def MavenBuild()
{
  sh 'mvn package'
}
def depoy(Jobname,ipaddress,context_path)
{
    sh 'scp /var/lib/jenkins/workspace/${Jobname}/webapp/target/webapp.war ubuntu@${ipaddress}:/var/lib/tomcat10/webapps/${context_path}.war'
}
