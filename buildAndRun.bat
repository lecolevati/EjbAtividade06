@echo off
call mvn clean package
call docker build -t com.mycompany/Atividade06TarefaEjb .
call docker rm -f Atividade06TarefaEjb
call docker run -d -p 9080:9080 -p 9443:9443 --name Atividade06TarefaEjb com.mycompany/Atividade06TarefaEjb