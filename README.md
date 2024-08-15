# 😎Estudos de Java

Este repositório é dedicado aos meus estudos de Java, onde revisarei tópicos importantes e resolverei desafios para aprimorar minhas habilidades.

## 👩🏻‍💻Estrutura do Repositório

- **Revisão de Conceitos**: Usando o mapa de estudos do devmagro para revisar e me aprofundar em Java e Spring boot -> [Java do básico ao Júnior](https://docs.google.com/document/d/12ek1Wsd_ibuwTOjHtLPZwEWdy5-A7cRoO2Bf-v5G1_s/edit)
- **Desafios**: Desafios propostos no mapa de estudos e na [Maratona Java Virado no Jiraya](https://www.youtube.com/watch?v=VKjFuX91G5Q&list=PL62G310vn6nFIsOCC0H-C2infYgwm8SWW&ab_channel=DevDojo)
- **Projetos**: Projetos pequenos para aplicar os conhecimentos adquiridos.

## ⌛️Tópicos de Estudo

Descritos brevemente no arquivos de [Tópicos a serem estudados](https://github.com/srtapoe/studying-javinha/blob/main/src/main/java/br/com/studies/topics-studied.md)

## 🪓Desafios

- [Desafio 1](https://github.com/srtapoe/studying-javinha/blob/main/src/main/java/br/com/studies/desafios/cadastro.md): [Cadastro via CLI](https://github.com/srtapoe/studying-javinha/tree/main/src/main/java/br/com/studies/desafios).
- [Desafio 2](desafios/Desafio2.md): Descrição do segundo desafio.
- [Desafio 3](desafios/Desafio3.md): Descrição do terceiro desafio.

## ⛏ Mudanças

- No [desafio 1](https://github.com/srtapoe/studying-javinha/tree/main/src/main/java/br/com/studies/desafios), eu alterei algumas coisas:
  1. Usei Json ao invés de txt;
  2. Adicionei a lib do [Gson](https://mvnrepository.com/artifact/com.google.code.gson/gson/2.11.0) para adicionar perguntas e respostas no Json, porque na vida real usamos mais libs do que o Java puro para tratar entrada de dados;
  3. Usei Records porque queria colocar em prática o que venho aprendendo nos cursos que finalizei;
  4. Vou melhorar a separação de funcionalidade e suas entidades. Fiquei com preguiça de refatorar e deixei a separação a nível bem fraco;
  5. Eu optei por usar uma lib, hibernate-validator, para validar as entradas das respostas. Fiquei com preguiça de implementar com métodos e no mundo real é mais fácil vê isso tudo sendo validado nas Entidades e outras camadas para coisas pontuais.
  6. Com uso da lib acima tive que usar o try/catch no método de cadastrarUsuario para validar as entradas e adicionar a verificação dos emails duplicados.
  7. Como usei a lib para validar e lançar as mensagens para os usuários, só criei a exception personalizada para o email duplicado.

## Prints do [Desafio 1](https://github.com/srtapoe/studying-javinha/blob/main/src/main/java/br/com/studies/desafios/cadastro.md): [Cadastro via CLI](https://github.com/srtapoe/studying-javinha/tree/main/src/main/java/br/com/studies/desafios).
![image](https://github.com/user-attachments/assets/6b857a65-769a-4bec-888a-397e0a727484)
![image](https://github.com/user-attachments/assets/93721c22-c0e7-49a0-be27-f53e0a1a4efa)
![image](https://github.com/user-attachments/assets/ceead48f-6859-4bc9-a55b-7d43e4c56086)
![image](https://github.com/user-attachments/assets/a9deeaac-2e75-471f-9c62-055b9c9a284f)
![image](https://github.com/user-attachments/assets/3908c3ab-914d-4707-a30b-7cdb6ca20604)
![image](https://github.com/user-attachments/assets/8ae9658b-46dd-4b84-b352-a5005ab84ffc)
![image](https://github.com/user-attachments/assets/b7f374a7-1ba4-4411-a750-0fd050241f67)
![image](https://github.com/user-attachments/assets/da788f7f-2ca9-46ee-8043-ec0ccd51d2f5)
