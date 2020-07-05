package com.masivian.rouletteTestForMasivian.database.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.masivian.rouletteTestForMasivian.database.entity.Bet;
import com.masivian.rouletteTestForMasivian.database.entity.Roulette;

public interface RouletteService {
	public ResponseEntity<Long> createRoulette(Roulette roulette); 
	public ResponseEntity<String> openRoulette(Long rouletteId);
	public Roulette checkRouletteValid(Long rouletteId);
	public void saveBetInRoulette(Bet bet, Roulette roulette);
	public ResponseEntity<List<Bet>> closeRoulette(Long rouletteId);
	public ResponseEntity<Iterable<Roulette>> allRoulette();
}
