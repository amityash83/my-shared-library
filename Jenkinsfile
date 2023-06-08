@Library('my-shared-library') _

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
