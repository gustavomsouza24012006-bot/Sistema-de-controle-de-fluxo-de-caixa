# Controle de Dívidas - Estrutura do Projeto

## 📁 Estrutura de Diretórios

```
Controle de dividas java/
├── pages/                              # Páginas HTML
│   ├── auth/                           # Autenticação
│   │   ├── login.html                  # Página de login
│   │   └── cadastro.html               # Página de cadastro
│   └── app/                            # Aplicação principal
│       ├── index.html                  # Dashboard principal
│       ├── caixa.html                  # Gerenciamento de caixa
│       ├── entradas.html               # Registro de entradas
│       ├── saidas.html                 # Registro de saídas
│       └── registrar-entrada.html      # Formulário rápido de entradas
├── assets/                             # Estilos CSS
│   ├── styles.css                      # Estilos globais
│   ├── auth/                           # Estilos de autenticação
│   │   ├── login.css                   # Estilos da página de login
│   │   └── cadastro.css                # Estilos da página de cadastro
│   └── app/                            # Estilos da aplicação
│       ├── caixa.css                   # Estilos da página de caixa
│       ├── entradas.css                # Estilos da página de entradas
│       ├── saidas.css                  # Estilos da página de saídas
│       └── registrar-entrada.css       # Estilos do formulário rápido
├── src/                                # Código-fonte Java
│   ├── Login.java
│   ├── Cadastro.java
│   ├── Dividas.java
│   ├── Entradas.java
│   ├── Saidas.java
│   └── armazenamentodedados.java
└── README.md                           # Documentação do projeto
```

## 🎯 Navegação entre páginas

### Autenticação
- **Login** (`pages/auth/login.html`) → Cadastro (`pages/auth/cadastro.html`)
- **Cadastro** (`pages/auth/cadastro.html`) → Login (`pages/auth/login.html`)

### Aplicação Principal
- **Dashboard** (`pages/app/index.html`) - Centro de controle
  - Caixa (`pages/app/caixa.html`)
  - Entradas (`pages/app/entradas.html`)
  - Saídas (`pages/app/saidas.html`)
  - Registrar Entrada (`pages/app/registrar-entrada.html`)

## 💻 Tecnologias Utilizadas

- **Frontend**: HTML5, CSS3, JavaScript
- **Backend**: Java
- **Estilo**: Design System com variáveis CSS
- **Responsivo**: Mobile-first com breakpoints

## 🎨 Sistema de Cores

O projeto utiliza variáveis CSS definidas em `assets/styles.css`:

- **Primária**: `#4f46e5` (Indigo)
- **Secundária**: `#0ea5e9` (Cyan)
- **Sucesso**: `#22c55e` (Verde)
- **Aviso**: `#f59e0b` (Laranja)
- **Perigo**: `#ef4444` (Vermelho)

## 🚀 Como usar

1. Inicie pelo arquivo `pages/auth/login.html` (login/cadastro)
2. Após autenticação, acesse `pages/app/index.html` (dashboard)
3. Navegue pelos módulos conforme necessário

## 📝 Notas

- Todos os caminhos de CSS e JavaScript foram atualizados para refletir a nova estrutura
- A pasta `Controle de dividas/` antiga pode ser excluída após validação
- Mantenha a organização modular para facilitar manutenção futura

---

**Última atualização**: 05/05/2026
