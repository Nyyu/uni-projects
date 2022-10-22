-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 20-Set-2022 às 01:52
-- Versão do servidor: 10.4.24-MariaDB
-- versão do PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `ifsis_lp3`
--
CREATE DATABASE IF NOT EXISTS `ifsis_lp3` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `ifsis_lp3`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) DEFAULT NULL,
  `cpfcnpj` varchar(15) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `observacao` text DEFAULT NULL,
  `datacadastro` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`id`, `nome`, `cpfcnpj`, `telefone`, `observacao`, `datacadastro`) VALUES
(1, 'Teste', '1231456', '44', 'Teste', '2022-08-30 22:12:06'),
(2, '1', '1', '1', '123', '2022-09-19 20:37:35'),
(3, '1', '1', '1', '1', '2022-09-19 20:38:34');

-- --------------------------------------------------------

--
-- Estrutura da tabela `compravenda`
--

CREATE TABLE `compravenda` (
  `id` int(11) NOT NULL,
  `operacao` char(1) NOT NULL,
  `id_cliente` int(11) NOT NULL,
  `formapagamento` int(11) NOT NULL,
  `desconto` double NOT NULL,
  `datacadastro` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `compravenda`
--

INSERT INTO `compravenda` (`id`, `operacao`, `id_cliente`, `formapagamento`, `desconto`, `datacadastro`) VALUES
(1, 'V', 1, 0, 1, '2022-08-30 22:12:24'),
(2, 'V', 1, 0, 0, '2022-09-19 19:24:10'),
(3, 'V', 1, 0, 0, '2022-09-19 19:26:20'),
(4, 'V', 1, 0, 0, '2022-09-19 20:12:12'),
(5, 'V', 1, 0, 0, '2022-09-19 20:13:50'),
(6, 'V', 1, 0, 0, '2022-09-19 20:15:21'),
(7, 'V', 1, 0, 0, '2022-09-19 20:45:16'),
(8, 'V', 1, 0, 0, '2022-09-19 20:46:53');

-- --------------------------------------------------------

--
-- Estrutura da tabela `compravendaproduto`
--

CREATE TABLE `compravendaproduto` (
  `id` int(11) NOT NULL,
  `id_compravenda` int(11) NOT NULL,
  `id_produto` int(11) NOT NULL,
  `quantidade` double NOT NULL,
  `valorunitario` double NOT NULL,
  `datacadastro` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `compravendaproduto`
--

INSERT INTO `compravendaproduto` (`id`, `id_compravenda`, `id_produto`, `quantidade`, `valorunitario`, `datacadastro`) VALUES
(1, 4, 1, 1, 21321, '2022-09-19 20:12:12'),
(2, 5, 1, 1, 23, '2022-09-19 20:13:50'),
(3, 6, 2, 1, 32.5, '2022-09-19 20:15:21'),
(4, 7, 1, 1, 23.5, '2022-09-19 20:45:16'),
(5, 8, 1, 1, 23.05, '2022-09-19 20:46:53');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produto`
--

CREATE TABLE `produto` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `unidadeDeMedida` varchar(15) DEFAULT NULL,
  `dataCadastro` datetime DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `produto`
--

INSERT INTO `produto` (`id`, `nome`, `unidadeDeMedida`, `dataCadastro`) VALUES
(1, 'Fone de ouvido', 'UN', '2022-08-01 20:23:25'),
(2, 'Mega fone de ouvido', 'UN', '2022-08-01 20:23:46');

-- --------------------------------------------------------

--
-- Estrutura da tabela `produtocategoria`
--

CREATE TABLE `produtocategoria` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `email` varchar(100) NOT NULL,
  `senha` varchar(255) NOT NULL,
  `datacriacao` datetime NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`id`, `nome`, `email`, `senha`, `datacriacao`) VALUES
(1, 'Testando', 'Testando@gmail.com', 'Opoderose', '2022-06-07 21:58:17'),
(2, 'Rogerson2', 'Opoderoso@gmail.com', '1234', '2022-06-07 21:58:47'),
(3, 'fjajfsaj', 'dgfaljlalalg', 'sdngldanlsnl', '2022-06-07 22:01:52'),
(4, 'kelaque', 'moscante@gmail.com', 'tpdolk', '2022-06-07 22:04:43'),
(6, '1', '1', '1', '2022-06-21 21:10:49'),
(9, '1123', '11123', '123', '2022-09-19 20:36:57');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuariogrupo`
--

CREATE TABLE `usuariogrupo` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `compravenda`
--
ALTER TABLE `compravenda`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_compravendacliente` (`id_cliente`);

--
-- Índices para tabela `compravendaproduto`
--
ALTER TABLE `compravendaproduto`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_compravendaprodutoscompravenda` (`id_compravenda`),
  ADD KEY `fk_compravendaprodutosproduto` (`id_produto`);

--
-- Índices para tabela `produto`
--
ALTER TABLE `produto`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `produtocategoria`
--
ALTER TABLE `produtocategoria`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `usuariogrupo`
--
ALTER TABLE `usuariogrupo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `compravenda`
--
ALTER TABLE `compravenda`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `compravendaproduto`
--
ALTER TABLE `compravendaproduto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `produto`
--
ALTER TABLE `produto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `produtocategoria`
--
ALTER TABLE `produtocategoria`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de tabela `usuariogrupo`
--
ALTER TABLE `usuariogrupo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `compravenda`
--
ALTER TABLE `compravenda`
  ADD CONSTRAINT `fk_compravendacliente` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`);

--
-- Limitadores para a tabela `compravendaproduto`
--
ALTER TABLE `compravendaproduto`
  ADD CONSTRAINT `fk_compravendaprodutoscompravenda` FOREIGN KEY (`id_compravenda`) REFERENCES `compravenda` (`id`),
  ADD CONSTRAINT `fk_compravendaprodutosproduto` FOREIGN KEY (`id_produto`) REFERENCES `produto` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
