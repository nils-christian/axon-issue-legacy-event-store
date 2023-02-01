package com.example.demo;

import org.axonframework.eventsourcing.eventstore.EventStorageEngine;
import org.axonframework.eventsourcing.eventstore.EventStore;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main( final String[] args ) {
		final ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder( DemoApplication.class )
				.logStartupInfo( false )
				.bannerMode( Banner.Mode.OFF )
				.run( args );
		System.out.println( applicationContext.getBean( EventStorageEngine.class ).getClass( ) );
		System.out.println( applicationContext.getBean( EventStore.class ).getClass( ) );

		applicationContext.stop( );
	}

}
