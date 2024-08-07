docker run --name fintech-mysql \
            -e MYSQL_ROOT_PASSWORD="fintech" \
            -e MYSQL_USER="fintech" \
            -e MYSQL_PASSWORD="fintech" \
            -e MYSQL_DATABASE="fintech" \
            -p 3310:3306 \
            --network docker_fintech \
            -d mysql:latest
