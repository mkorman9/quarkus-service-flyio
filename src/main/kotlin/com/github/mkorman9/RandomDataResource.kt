package com.github.mkorman9

import jakarta.ws.rs.Consumes
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

data class RandomDataResponse(val data: String)

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(value = [])
class RandomDataResource {
    @GET
    fun randomData() = RandomDataResponse(
        data = randomPayload(16)
    )
}
