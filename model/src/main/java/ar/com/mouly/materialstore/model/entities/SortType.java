package ar.com.mouly.materialstore.model.entities;

/**
 * @author amouly on 4/19/15.
 */
public enum SortType {

    RELEVANCE {
        public String toString() {
            return "relevance";
        }
    },

    LOWEST_PRICE {
        public String toString() {
            return "lowest price";
        }
    },

    HIGHEST_PRICE {
        public String toString() {
            return "highest price";
        }
    },

    NEWEST {
        public String toString() {
            return "newest";
        }
    },

    OLDEST {
        public String toString() {
            return "oldest";
        }
    },

    POPULARITY {
        public String toString() {
            return "popularity";
        }
    }

}
