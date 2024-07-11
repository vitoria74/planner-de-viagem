CREATE TABLE trips { --cadastro da viagem
    id UUID DEFAULT RANDOM_UUID() PRIMARY KEY -- função que gera um id
    destination VARCHAR(255) NOT NULL,
    starts_at TIMESTAMP NOT NULL,
    ends_at TIMESTAMP NOT NULL,
    is_confirmed BOOLEAN NOT NULL,
    owner_name VARCHAR(255) NOT NULL,
    owner_email VARCHAR(255) NOT NULL
};