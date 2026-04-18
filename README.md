# Sistema de Controle de Aluguel de Quadra (POO)

## Descrição
Sistema desenvolvido para controle de aluguel de quadra esportiva, permitindo cadastro de clientes, horários e registro de aluguéis.

## Tabelas (Entidades)

### Cliente
- id
- nome
- telefone

### Horario
- id
- hora
- valor
- disponivel

### Aluguel
- id
- cliente
- lista de horarios
- valor total
- data

## Regras de Negócio

- Não permitir cadastrar cliente com nome vazio
- Não permitir cadastrar horário com valor negativo
- Não permitir reservar horário já ocupado
- Calcular automaticamente o valor total do aluguel
- Permitir múltiplos horários no mesmo aluguel
- Permitir consulta de aluguéis por data

## Funcionamento

O sistema cria clientes e horários disponíveis, permitindo realizar reservas (aluguéis) associando cliente + horários. O valor total é calculado automaticamente com base nos horários escolhidos.

## Execução

Executar a classe Main para simular um aluguel.
