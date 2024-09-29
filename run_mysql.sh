docker run -d --name mysql-tp4 \
	-e MYSQL_ROOT_PASSWORD=rootpassword \
	-e MYSQL_DATABASE=tp4db \
	-p 3307:3306 \
	--network net-tp4 \
	mysql:latest
