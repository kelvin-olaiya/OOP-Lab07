package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.socialnetwork.User;

/**
 * This is going to act as a test for
 * {@link it.unibo.oop.lab.enum1.SportSocialNetworkUserImpl}
 * 
 * 1) Realize the same test as the previous exercise, this time using
 * enumeration Sport
 * 
 * 2) Run it: every test must return true.
 * 
 */
public final class TestSportByEnumeration {

    private TestSportByEnumeration() { }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String... args) {
        /*
         * [TEST DEFINITION]
         * 
         * By now, you know how to do it
         */
        /*
         * Create 3 users
         */
    	final SportSocialNetworkUserImpl<User> kelvin = new SportSocialNetworkUserImpl<>("Kelvin", "Olaiya", "kel$", 20);
    	final SportSocialNetworkUserImpl<User> stefano = new SportSocialNetworkUserImpl<> ("Stefano", "Scolari", "scolapasta", 20);
    	final SportSocialNetworkUserImpl<User> lore = new SportSocialNetworkUserImpl<>("Lorenzo", "Maiani", "lore", 21);
    	
    	/*
    	 * Kelvin likes: BASKET, BIKE, VOLLEY
    	 */
    	kelvin.addSport(Sport.BASKET);
    	kelvin.addSport(Sport.BIKE);
    	kelvin.addSport(Sport.VOLLEY);
    	/*
    	 * Lorenzo likes: BASKET, BIKE
    	 */
    	lore.addSport(Sport.BASKET);
    	lore.addSport(Sport.BIKE);
    	/*
    	 * Sefano likes: BIKE, SOCCER
    	 */
    	stefano.addSport(Sport.BIKE);
    	stefano.addSport(Sport.SOCCER);
    	/*
    	 * test
    	 */
    	System.out.println("[TEST] Kelvin likes basket: " + kelvin.hasSport(Sport.BASKET));
    	System.out.println("[TEST] Kelvin doesn't like F1: " + !kelvin.hasSport(Sport.F1));
    	System.out.println("[TEST] Stefano likes bike: " + stefano.hasSport(Sport.BIKE));
    	System.out.println("[TEST] Stefano doesn't like VOLLEY: " + !stefano.hasSport(Sport.VOLLEY));
    	
    }
}
