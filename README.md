# Calculadora JUnit

## Sobre
Exercício desenvolvido durante a disciplina **Qualidade e Teste de Software** com o objetivo de compreender a importância do teste de software durante o desenvolvimento do mesmo.


## Pré-requisitos

Antes de começar, é ideal ter o [Git](https://git-scm.com) instalado, e as seguintes tecnologias para a execução do projeto:

* [Java 11](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html) , [leia](#configurando-java-home-no-windows) antes de instalar;

* [Eclipse](https://www.eclipse.org/downloads/) **, ou outra IDE de sua preferência**.


## Configurando JAVA-HOME no Windows
1. Copie o caminho de instalação do Java JDK em um bloco de notas, deve ser parecido com o seguinte caminho;<br>
`C:\Program Files\Java\jdk-11.0.16`
2. Em inicar, procure por PowerShell e abra como administrador;
3. Copie a seguinte linha de código e substitua **PATH** pelo caminho copiado;
```
[Environment]::SetEnvironmentVariable("JAVA_HOME", "PATH", "Machine")
```
4. Copie a seguinte linha de código e substitua **PATH** pelo caminho copiado só que dessa vez incluindo a pasta **bin**, deve ser parecido com o seguinte caminho;<br>
`C:\Program Files\Java\jdk-11.0.16\bin`;
```
$OLDPATH = [System.Environment]::GetEnvironmentVariable('PATH','machine')
$JAVAPATH = [System.Environment]::GetEnvironmentVariable('JAVA_HOME','machine')
$NEWPATH = "$OLDPATH;$JAVAPATH\bin"
[Environment]::SetEnvironmentVariable("PATH", "$NEWPATH", "Machine")
```
5. Em iniciar, procure por **prompt**, **cmd** ou **dos**;
6. Para verificar se o JAVA-HOME está configurado, a saída deve ser parecida com o seguinte caminho, após a execução do comando abaixo;
`C:\Program Files\Java\jdk-11.0.16`
```
echo %JAVA_HOME%
```
7. Para verificar a aplicação Java, a saída deve ser parecida com a seguinte, após a execução do comando abaixo;<br>
`java version "11.0.16" 2022-07-19 LTS`<br>
`Java(TM) SE Runtime Environment 18.9 (build 11.0.16+11-LTS-199)`<br>
`Java HotSpot(TM) 64-Bit Server VM 18.9 (build 11.0.16+11-LTS-199, mixed mode)`
```
java -version
```


## Clone este repositório
```
$ git clone https://github.com/sergiotavuencas/calculadora-junit
```


## Executando
Basta abrir o repositório na IDE e executar a classe que desejar.


## Tecnologias
* Eclipse IDE 2022-06
* Java 11
* JUnit 4
