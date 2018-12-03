package gwt.jelement.core;

import jsinterop.annotations.*;

/**
 * JavaScript native <a href="https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise">Promise</a> object.
 * @param <F> type of fulfillment value
 */
@JsType(namespace = JsPackage.GLOBAL, name="Promise", isNative = true)
public class Promise<F> implements IsObject {

	@JsFunction
	@FunctionalInterface
	public interface Consumer<T> {
		void accept(T obj);
	}

	@JsFunction
	@FunctionalInterface
	public interface Function<T, R> {
		R apply(T obj);
	}

	@JsFunction
	@FunctionalInterface
	public interface Procedure {
		void call();
	}

	/**
	 * Returns a promise that resolves or rejects as soon as one of the promises in the arguments resolves or rejects,
	 * with the value or reason from that promise.
	 */
	@JsOverlay
	public static Promise<?> race(Promise<?>... any) {
		return race(new Array<>(any));
	}

	/**
	 * Returns a single Promise that resolves when all of the promises in the arguments have resolved
	 * or when the iterable argument contains no promises.
	 * It rejects with the reason of the first promise that rejects.
	 */
	@JsOverlay
	public static Promise<?> all(Promise<?>... all) {
		return all(new Array<>(all));
	}

	/**
	 * Returns a promise that resolves or rejects as soon as one of the promises in the iterable resolves or rejects,
	 * with the value or reason from that promise.
	 */
	@JsMethod(name = "race")
	private static native Promise<?> race(Array<Promise<?>> iterable);

	/**
	 * Returns a single Promise that resolves when all of the promises in the iterable argument have resolved
	 * or when the iterable argument contains no promises.
	 * It rejects with the reason of the first promise that rejects.
	 */
	@JsMethod(name = "all")
	private static native Promise<?> all(Array<Promise<?>> iterable);

	/**
	 * Returns a Promise object that is rejected with the given reason.
	 * @param reason rejection reason
	 */
	@JsMethod(name = "reject")
	public static native <F> Promise<F> reject(Object reason);

	/**
	 * Returns a Promise object that is resolved with the given value.
	 * If the value is a thenable (i.e. has a "then" method), the returned promise will "follow" that thenable,
	 * adopting its eventual state; if the value was a promise, that object becomes the result of the call to Promise.resolve;
	 * otherwise the returned promise will be fulfilled with the value.
	 */
	@JsMethod(name = "resolve")
	public static native <F> Promise<F> resolve(F value);

	/**
	 * Creates a new promise. executor parameter must in turn call one of its parameters (resolve / reject).
	 * @param executor a function that is passed with the arguments resolve and reject.
	 *                 The executor function is executed immediately by the Promise implementation,
	 *                 passing resolve and reject functions (the executor is called before the Promise constructor
	 *                 even returns the created object).
	 *                 The resolve and reject functions, when called, resolve or reject the promise, respectively.
	 *                 The executor normally initiates some asynchronous work, and then, once that completes,
	 *                 either calls the resolve function to resolve the promise or else rejects it if an error occurred.
	 *                 If an error is thrown in the executor function, the promise is rejected.
	 */
	@JsConstructor
	public Promise(PromiseExecutor<F> executor) {
	}

	/**
	 * Returns a Promise. It takes one argument: callback functions for the success case of the Promise.
	 * @param onFulfilled a function called if the Promise is fulfilled. This function has one argument, the fulfillment value
	 * @return a Promise in the pending status. The handler function (onFulfilled) then gets called asynchronously.
	 */
	@JsMethod(name = "then")
	public native Promise<F> then(Consumer<F> onFulfilled);

	/**
	 * Returns a Promise. It takes one argument: callback functions for the success case of the Promise.
	 * @param onFulfilled a function called if the Promise is fulfilled. This function has one argument, the fulfillment value
	 * @param <R> type of object to accept in consecutive then related chained calls if onFulfilled returns value
	 * @return a Promise in the pending status. The handler function (onFulfilled) then gets called asynchronously
	 */
	@JsMethod(name = "then")
	public native <R> Promise<R> thenReturn(Function<F, R> onFulfilled);

	/**
	 * Returns a Promise. It takes one argument: callback functions for the success case of the Promise.
	 * @param onFulfilled a function called if the Promise is fulfilled. This function has one argument, the fulfillment value
	 * @param <R> type of object to accept in consecutive then related chained calls if onFulfilled returns value
	 * @return a Promise in the pending status. The handler function (onFulfilled) then gets called asynchronously
	 */
	@JsMethod(name = "then")
	public native <R> Promise<R> thenReturnPromise(Function<F, Promise<R>> onFulfilled);

	/**
	 * Returns a Promise. It takes two arguments: callback functions for the success and failure cases of the Promise.
	 * @param onFulfilled a function called if the Promise is fulfilled. This function has one argument, the fulfillment value
	 * @param onRejected a function called if the Promise is rejected. This function has one argument, the rejection reason
	 * @param <XT> type of rejection reason argument
	 * @return a Promise in the pending status. The handler function (onFulfilled or onRejected) then gets called asynchronously
	 */
	@JsMethod(name = "then")
	public native <XT> Promise<F> thenOrCatch(Consumer<F> onFulfilled, Consumer<XT> onRejected);

	/**
	 * Returns a Promise. It takes two arguments: callback functions for the success and failure cases of the Promise.
	 * @param onFulfilled a function called if the Promise is fulfilled. This function has one argument, the fulfillment value
	 * @param onRejected a function called if the Promise is rejected. This function has one argument, the rejection reason
	 * @param <R> type of object to accept in consecutive then related chained calls if onFulfilled returns value
	 * @param <XT> type of rejection reason argument
	 * @return a Promise in the pending status. The handler function (onFulfilled or onRejected) then gets called asynchronously
	 */
	@JsMethod(name = "then")
	public native <R, XT> Promise<R> thenReturnOrCatch(Function<F, R> onFulfilled, Consumer<XT> onRejected);

	/**
	 * Returns a Promise. It takes two arguments: callback functions for the success and failure cases of the Promise.
	 * @param onFulfilled a function called if the Promise is fulfilled. This function has one argument, the fulfillment value
	 * @param onRejected a function called if the Promise is rejected. This function has one argument, the rejection reason
	 * @param <R> type of object to accept in consecutive then related chained calls if onFulfilled returns value
	 * @param <XT> type of rejection reason argument
	 * @return a Promise in the pending status. The handler function (onFulfilled or onRejected) then gets called asynchronously
	 */
	@JsMethod(name = "then")
	public native <R, XT> Promise<R> thenReturnPromiseOrCatch(Function<F, Promise<R>> onFulfilled, Consumer<XT> onRejected);

	/**
	 * Returns a Promise. It takes two arguments: callback functions for the success and failure cases of the Promise.
	 * @param onFulfilled a function called if the Promise is fulfilled. This function has one argument, the fulfillment value
	 * @param onRejected a function called if the Promise is rejected. This function has one argument, the rejection reason
	 * @param <XT> type of rejection reason argument
	 * @param <XR> type of object to accept in consecutive then related chained calls if onRejected returns value
	 * @return a Promise in the pending status. The handler function (onFulfilled or onRejected) then gets called asynchronously
	 */
	@JsMethod(name = "then")
	public native <T, XT, XR> Promise<T> thenOrCatchReturn(Consumer<F> onFulfilled, Function<XT, XR> onRejected);

	/**
	 * Returns a Promise. It takes two arguments: callback functions for the success and failure cases of the Promise.
	 * @param onFulfilled a function called if the Promise is fulfilled. This function has one argument, the fulfillment value
	 * @param onRejected a function called if the Promise is rejected. This function has one argument, the rejection reason
	 * @param <R> type of object to accept in consecutive then related chained calls if onFulfilled returns value
	 * @param <XT> type of rejection reason argument
	 * @param <XR> type of object to accept in consecutive then related chained calls if onRejected returns value
	 * @return a Promise in the pending status. The handler function (onFulfilled or onRejected) then gets called asynchronously
	 */
	@JsMethod(name = "then")
	public native <T, R, XT, XR> Promise<T> thenReturnOrCatchReturn(Function<F, R> onFulfilled, Function<XT, XR> onRejected);

	/**
	 * Returns a Promise and deals with rejected cases only.
	 * It behaves the same as calling {@link #thenOrCatch(Consumer, Consumer)} with first argument being undefined.
	 * @param onRejected a function called when the Promise is rejected. This function has one argument: reason - The rejection reason.
	 * @param <X> type of rejection reason argument
	 * @return The Promise returned is rejected if onRejected throws an exception; otherwise, it is resolved
	 */
	@JsMethod(name = "catch")
	public native <X> Promise<Void> catch_(Consumer<X> onRejected);

	/**
	 * Returns a Promise and deals with rejected cases only.
	 * It behaves the same as calling {@link #thenOrCatchReturn(Consumer, Function)} with first argument being undefined.
	 * @param onRejected a function called when the Promise is rejected. This function has one argument: reason - The rejection reason.
	 * @param <X> type of rejection reason argument
	 * @param <R> type of object to accept in consecutive then related chained calls if onRejected returns value
	 * @return The Promise returned is rejected if onRejected throws an exception or returns a Promise which is itself rejected;
	 *         otherwise, it is resolved
	 */
	@JsMethod(name = "catch")
	public native <T, X, R> Promise<T> catchReturn(Function<X, R> onRejected);

	/**
	 * Returns a Promise. When the promise is settled, whether fulfilled or rejected,
	 * the specified callback function is executed.
	 * This provides a way for code that must be executed once the Promise has been dealt with to be run whether
	 * the promise was fulfilled successfully or rejected.
	 * This lets you avoid duplicating code in both the promise's then() and catch() handlers.
	 * @param onFinally a function called when the Promise is settled
	 * @return a Promise whose finally handler is set to the specified function, onFinally
	 */
	@JsMethod(name = "finally")
	public native Promise<F> finally_(Procedure onFinally);

}
