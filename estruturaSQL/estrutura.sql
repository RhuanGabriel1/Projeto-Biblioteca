-- drop table usuario

create table bibliotecario(
id int not null generated by default as identity primary key,
nome varchar(100) not null,
email varchar(100) not null
);

create table usuario(
cpf varchar(11) not null primary key,
nome varchar(100) not null,
email varchar(100) not null,
celular varchar(11),
suspencao boolean not null,
numero_livro int not null
);

create table livro(
id int not null generated by default as identity primary key,
nome varchar(100) not null,
autor varchar(100) not null,
ano_publicacao int not null,
editora varchar(100) not null,
quantidade int not null
);

create table emprestimo(
id int not null generated by default as identity primary key,

id_livro int not null,
constraint id_livro foreign key (id_livro) references livro(id),

cpf_usuario varchar(11) not null,
constraint cpf_usuario foreign key (cpf_usuario) references usuario(cpf),

id_bibliotecario int not null ,
constraint id_bibliotecario foreign key (id_bibliotecario) references bibliotecario(id),

data_retirada date not null,
data_devolucao date,
data_limite date not null
);
