package com.blitzkrieg.android.domain.executor

import io.reactivex.Scheduler

/* We will create a Thread class which will implement this interface.
This allows us to provide the Android main thread scheduler for use by a domain layer
with abstraction intact
*/
interface PostExecutionThread {
    val scheduler: Scheduler
}