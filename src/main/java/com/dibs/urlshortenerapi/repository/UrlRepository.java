package com.dibs.urlshortenerapi.repository;

import com.dibs.urlshortenerapi.entity.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UrlRepository extends JpaRepository<Url, Long> {
}
