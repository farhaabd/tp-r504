# effacer le volume de stockage
docker volume rm vol-sql-demo

# lancement serveur sql
docker run -d \
	-p 3307:3306 \
	-v vol-sql-demo:/var/lib/mysql \
	--name tp4-spl \
	--env MYSQL_ROOT_PASSWORD=foo \
	--network net-tp4 \
	mysql:8.0
