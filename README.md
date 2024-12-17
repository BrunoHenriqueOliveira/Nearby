# Nearby

Nearby é um aplicativo mobile de clube de benefícios com cupons para utilizar em estabelecimentos próximos a você. Esse é o projeto do evento NLW Pocket Mobile, um dos conteúdos disponíveis para alunos da Rocketseat.

## Aviso antes de usar

Este aplicativo requer:

1. Uma API backend separada funcionando na sua máquina para que todas as funcionalidades sejam executadas corretamente. Certifique-se de configurar e iniciar a API antes de usar o aplicativo.
2. Uma chave de API do Google Maps configurada para habilitar as funcionalidades de mapa.

## Funcionalidades

- Explorar estabelecimentos próximos usando integração com a Google Maps API.
- Obter cupons de desconto e benefícios para estabelecimentos locais.
- Interface moderna utilizando Jetpack Compose.

## Tecnologias utilizadas

- **Kotlin** com **Android Studio**
- Arquitetura: **MVI + Clean Architecture**
- **Jetpack Compose**, **ViewModel**, **Lifecycle**, **Navigation**
- **Google Maps API**
- Coroutines, Flow
- **Ktor** para comunicação com o backend
- **Kotlinx Serialization** para manipulação de dados
- **Coil** para carregamento de imagens
- Gerenciamento de dependências com **Gradle**

## Configuração do projeto

### Pré-requisitos

- Android Studio instalado (versão mais recente).
- Configuração de uma chave da Google Maps API.
- Backend configurado e funcionando localmente.

### Como configurar a Google Maps API

1. Crie ou acesse um projeto no [Google Cloud Console](https://console.cloud.google.com/).
2. Ative a API do Google Maps.
3. Gere uma chave de API.
4. No arquivo `local.properties`, adicione a linha:
   ```properties
   MAPS_API_KEY=SUA_CHAVE_AQUI
   ```
5. A chave será automaticamente utilizada pelo aplicativo graças à configuração de placeholders no `build.gradle` e no `AndroidManifest.xml`.

### Rodando o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/BrunoHenriqueOliveira/Nearby
   ```
2. Abra o projeto no Android Studio.
3. Configure o backend e inicie-o localmente.
4. Sincronize as dependências do Gradle.
5. Execute o aplicativo em um emulador ou dispositivo físico.

## Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

