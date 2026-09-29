# 🎓 Cálculo de Média de Aluno em Java

Projeto introdutório em Java que realiza o cálculo da média aritmética de um aluno a partir de três notas informadas via terminal e exibe a situação acadêmica final (Aprovado, Recuperação ou Reprovado).

Ideal para estudantes de primeiro semestre de cursos de Ciência da Computação, Engenharia de Software, ADS e afins.

---

## 📌 Funcionalidades

- Leitura de 3 notas com casas decimais via terminal usando `Scanner`.
- Cálculo da média aritmética simples.
- Validação e exibição do status do aluno:
  - **Média $\ge$ 7.0**: Aprovado
  - **5.0 $\le$ Média < 7.0**: Recuperação
  - **Média < 5.0**: Reprovado
- Formatação de saída com duas casas decimais.

---

## 🚀 Como Executar

### Pré-requisitos
- Ter o [Java JDK](https://adoptium.net/) instalado na máquina (versão 8 ou superior).

### Passo a passo no Terminal:

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/LuGoAn/calcula-media-java.git
   cd calcula-media-java
   ```

2. **Compile o programa:**
   ```bash
   javac CalculaMedia.java
   ```

3. **Execute:**
   ```bash
   java CalculaMedia
   ```

*(Em versões do Java 11 ou superior, você também pode rodar diretamente com `java CalculaMedia.java` sem compilar previamente).*

---

## 💻 Exemplo de Execução

```text
=========================================
      SISTEMA DE CALCULO DE MEDIA        
=========================================
Digite a 1a nota: 8.5
Digite a 2a nota: 7.0
Digite a 3a nota: 6.5
-----------------------------------------
Media final: 7.33
Situacao: APROVADO! Parabens!
=========================================
```

---

## 📝 Licença

Este projeto foi desenvolvido para fins educacionais e de estudo.
