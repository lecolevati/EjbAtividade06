#!/bin/sh
mvn clean package && docker build -t com.mycompany/Atividade06TarefaEjb .
docker rm -f Atividade06TarefaEjb || true && docker run -d -p 9080:9080 -p 9443:9443 --name Atividade06TarefaEjb com.mycompany/Atividade06TarefaEjb