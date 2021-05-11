
pipelineJob('build-jenkins-image') {
  definition {
    cps {
      script(readFileFromWorkspace('./jobs/jenkins/build-image/Jenkinsfile.declarative'))
      sandbox()
    }
  }
}
