def call(){
    sh '''
        cd /home/ubuntu/workspace/DjangoCICD
        docker compose down
        docker compose up -d
    '''
}
