## Docker usefulcommands
- configure prometheus config file
  ```
  docker run -d --name=prometheus -p 9090:9090 -v C:\Users\CarlosGamboa\Downloads\career-path\data\prometheus\prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml
  ```
- Remove the container 
    ```
    docker container rm prometheus
    ```
- As we are using dockerized prometheus remember the dns localhost issue..
  http://192.168.80.11/ as per C:\Windows\System32\drivers\etc\host