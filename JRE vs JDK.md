**Diferença**



JRE - Java Runtime Env. (ambiente de execução java) //usado pelo usuário

JDK - Java Dev. Kit (Kit desenvolvedor Java) //usado pelo Dev



JVM - Java Virtual Machine (máquina virtual) //contido em JRE

Funciona, superficialmente, como tradutor



.Java -> .Class (arquivo ByteCode)

o arquivo ByteCode não são interpretados por sistemas

portanto, é preciso que cada sistema possua uma JVM que traduza a .Class

 

o JDK contém tudo que JRE tem incluindo a JVM + ferramentas de programação.

JRE é o programa comum Java que baixamos no Oracle para rodar apps em Java.



Javac vs Java



**Diferença**



JAVAC - Java Compiler (compilador)

Serve para compilar o código .Java e transformar em ByteCode .Class



.Java significa estar legível por humanos

.Class ByteCode, transformado em um arquivo que a JVM entende



JAVA - Java Launcher (executador)

executa o ByteCode .Class que foi gerado pelo Javac



Depois que compilado (.Class), quem roda é o Java chamando a JVM



