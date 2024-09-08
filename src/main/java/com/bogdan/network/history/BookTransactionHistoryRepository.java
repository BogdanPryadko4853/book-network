package com.bogdan.network.history;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookTransactionHistoryRepository extends JpaRepository<BookTransactionHistory, Long> {
}
