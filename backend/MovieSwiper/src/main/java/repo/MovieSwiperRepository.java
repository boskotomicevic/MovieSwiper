package repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MovieSwiperRepository extends JpaRepository<MovieSwiper, Long> {
}
