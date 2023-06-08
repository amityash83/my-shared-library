@Library(['my-shared-library']) _

library identifier: 'my-shared-library@main', retriever: modernSCM([$class: 'GitSCMSource',
    remote: 'https://github.com/amityash83/my-shared-library.git'
])

pipeline {
    agent any

    stages {
        stage('Example Stage') {
            steps {
                script {
                    libraryA.libraryAMethod()
                    libraryB.libraryBMethod()
                    shared.sharedMethod()
                }
            }
        }
    }
}
