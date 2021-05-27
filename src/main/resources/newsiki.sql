-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Czas generowania: 27 Maj 2021, 17:29
-- Wersja serwera: 8.0.13-4
-- Wersja PHP: 7.2.24-0ubuntu0.18.04.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Baza danych: `z2HSannMds`
--

-- --------------------------------------------------------

--
-- Struktura tabeli dla tabeli `newsiki`
--

CREATE TABLE `newsiki` (
  `id` int(11) NOT NULL,
  `source` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `author` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `title` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `url` varchar(150) COLLATE utf8_unicode_ci NOT NULL,
  `description` varchar(1000) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Zrzut danych tabeli `newsiki`
--

INSERT INTO `newsiki` (`id`, `source`, `author`, `title`, `url`, `description`) VALUES
(1, 'pl.lech.newsik.model.Source@575bda8b[id=<null>,name=Interia.pl,additionalProperties={}]', 'null', 'Lekkoatletyka. MŚ sztafet. Polacy nie awansowali do finału 4x400 m', 'https://sport.interia.pl/lekkoatletyka/news-lekkoatletyka-ms-sztafet-polacy-nie-awansowali-do-finalu-4x4,nId,5205524', 'Polacy nie zakwalifikowali się do finału biegu 4x400 m podczas lekkoatletycznych mistrzostw świata sztafet, odbywających się na Stadionie Śląskim w Chorzowie. Tym samym nie wywalczyli na razie awansu na igrzyska olimpijskie w Tokio.');

--
-- Indeksy dla zrzutów tabel
--

--
-- Indeksy dla tabeli `newsiki`
--
ALTER TABLE `newsiki`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT dla tabeli `newsiki`
--
ALTER TABLE `newsiki`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
