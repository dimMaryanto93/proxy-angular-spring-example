# Menggunakan proxy

## how to run

- `cd client && ng serve --proxy-config proxy.conf.js`
- `cd server && mvn clean spring-boot:run`

## how to access data from client

- `curl http://localhost:4200/api/mahasiswa/list` 
