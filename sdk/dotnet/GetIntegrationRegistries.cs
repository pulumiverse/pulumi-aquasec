// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;
using Pulumi;

namespace Pulumiverse.Aquasec
{
    public static class GetIntegrationRegistries
    {
        public static Task<GetIntegrationRegistriesResult> InvokeAsync(GetIntegrationRegistriesArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetIntegrationRegistriesResult>("aquasec:index/getIntegrationRegistries:getIntegrationRegistries", args ?? new GetIntegrationRegistriesArgs(), options.WithDefaults());

        public static Output<GetIntegrationRegistriesResult> Invoke(GetIntegrationRegistriesInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetIntegrationRegistriesResult>("aquasec:index/getIntegrationRegistries:getIntegrationRegistries", args ?? new GetIntegrationRegistriesInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetIntegrationRegistriesArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Automatically clean up that don't match the pull criteria
        /// </summary>
        [Input("advancedSettingsCleanup")]
        public bool? AdvancedSettingsCleanup { get; set; }

        [Input("alwaysPullPatterns")]
        private List<string>? _alwaysPullPatterns;

        /// <summary>
        /// List of image patterns to pull always
        /// </summary>
        public List<string> AlwaysPullPatterns
        {
            get => _alwaysPullPatterns ?? (_alwaysPullPatterns = new List<string>());
            set => _alwaysPullPatterns = value;
        }

        /// <summary>
        /// Additional condition for pulling and rescanning images, Defaults to 'none'
        /// </summary>
        [Input("imageCreationDateCondition")]
        public string? ImageCreationDateCondition { get; set; }

        /// <summary>
        /// The last time the registry was modified in UNIX time
        /// </summary>
        [Input("lastupdate")]
        public int? Lastupdate { get; set; }

        /// <summary>
        /// The name of the registry; string, required - this will be treated as the registry's ID, so choose a simple alphanumerical name without special signs and spaces
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        [Input("options")]
        private List<Inputs.GetIntegrationRegistriesOptionArgs>? _options;
        public List<Inputs.GetIntegrationRegistriesOptionArgs> Options
        {
            get => _options ?? (_options = new List<Inputs.GetIntegrationRegistriesOptionArgs>());
            set => _options = value;
        }

        /// <summary>
        /// When auto pull image enabled, sets maximum age of auto pulled images
        /// </summary>
        [Input("pullImageAge")]
        public string? PullImageAge { get; set; }

        /// <summary>
        /// When auto pull image enabled, sets maximum age of auto pulled images tags from each repository.
        /// </summary>
        [Input("pullImageCount")]
        public int? PullImageCount { get; set; }

        [Input("pullImageTagPatterns")]
        private List<string>? _pullImageTagPatterns;

        /// <summary>
        /// List of image tags patterns to pull
        /// </summary>
        public List<string> PullImageTagPatterns
        {
            get => _pullImageTagPatterns ?? (_pullImageTagPatterns = new List<string>());
            set => _pullImageTagPatterns = value;
        }

        [Input("pullRepoPatternsExcludeds")]
        private List<string>? _pullRepoPatternsExcludeds;

        /// <summary>
        /// List of image patterns to exclude
        /// </summary>
        public List<string> PullRepoPatternsExcludeds
        {
            get => _pullRepoPatternsExcludeds ?? (_pullRepoPatternsExcludeds = new List<string>());
            set => _pullRepoPatternsExcludeds = value;
        }

        /// <summary>
        /// Registry scan timeout in Minutes
        /// </summary>
        [Input("registryScanTimeout")]
        public int? RegistryScanTimeout { get; set; }

        [Input("scannerNames")]
        private List<string>? _scannerNames;

        /// <summary>
        /// List of scanner names
        /// </summary>
        public List<string> ScannerNames
        {
            get => _scannerNames ?? (_scannerNames = new List<string>());
            set => _scannerNames = value;
        }

        /// <summary>
        /// Scanner type
        /// </summary>
        [Input("scannerType")]
        public string? ScannerType { get; set; }

        [Input("webhooks")]
        private List<Inputs.GetIntegrationRegistriesWebhookArgs>? _webhooks;

        /// <summary>
        /// When enabled, registry events are sent to the given Aqua webhook url
        /// </summary>
        public List<Inputs.GetIntegrationRegistriesWebhookArgs> Webhooks
        {
            get => _webhooks ?? (_webhooks = new List<Inputs.GetIntegrationRegistriesWebhookArgs>());
            set => _webhooks = value;
        }

        public GetIntegrationRegistriesArgs()
        {
        }
        public static new GetIntegrationRegistriesArgs Empty => new GetIntegrationRegistriesArgs();
    }

    public sealed class GetIntegrationRegistriesInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Automatically clean up that don't match the pull criteria
        /// </summary>
        [Input("advancedSettingsCleanup")]
        public Input<bool>? AdvancedSettingsCleanup { get; set; }

        [Input("alwaysPullPatterns")]
        private InputList<string>? _alwaysPullPatterns;

        /// <summary>
        /// List of image patterns to pull always
        /// </summary>
        public InputList<string> AlwaysPullPatterns
        {
            get => _alwaysPullPatterns ?? (_alwaysPullPatterns = new InputList<string>());
            set => _alwaysPullPatterns = value;
        }

        /// <summary>
        /// Additional condition for pulling and rescanning images, Defaults to 'none'
        /// </summary>
        [Input("imageCreationDateCondition")]
        public Input<string>? ImageCreationDateCondition { get; set; }

        /// <summary>
        /// The last time the registry was modified in UNIX time
        /// </summary>
        [Input("lastupdate")]
        public Input<int>? Lastupdate { get; set; }

        /// <summary>
        /// The name of the registry; string, required - this will be treated as the registry's ID, so choose a simple alphanumerical name without special signs and spaces
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("options")]
        private InputList<Inputs.GetIntegrationRegistriesOptionInputArgs>? _options;
        public InputList<Inputs.GetIntegrationRegistriesOptionInputArgs> Options
        {
            get => _options ?? (_options = new InputList<Inputs.GetIntegrationRegistriesOptionInputArgs>());
            set => _options = value;
        }

        /// <summary>
        /// When auto pull image enabled, sets maximum age of auto pulled images
        /// </summary>
        [Input("pullImageAge")]
        public Input<string>? PullImageAge { get; set; }

        /// <summary>
        /// When auto pull image enabled, sets maximum age of auto pulled images tags from each repository.
        /// </summary>
        [Input("pullImageCount")]
        public Input<int>? PullImageCount { get; set; }

        [Input("pullImageTagPatterns")]
        private InputList<string>? _pullImageTagPatterns;

        /// <summary>
        /// List of image tags patterns to pull
        /// </summary>
        public InputList<string> PullImageTagPatterns
        {
            get => _pullImageTagPatterns ?? (_pullImageTagPatterns = new InputList<string>());
            set => _pullImageTagPatterns = value;
        }

        [Input("pullRepoPatternsExcludeds")]
        private InputList<string>? _pullRepoPatternsExcludeds;

        /// <summary>
        /// List of image patterns to exclude
        /// </summary>
        public InputList<string> PullRepoPatternsExcludeds
        {
            get => _pullRepoPatternsExcludeds ?? (_pullRepoPatternsExcludeds = new InputList<string>());
            set => _pullRepoPatternsExcludeds = value;
        }

        /// <summary>
        /// Registry scan timeout in Minutes
        /// </summary>
        [Input("registryScanTimeout")]
        public Input<int>? RegistryScanTimeout { get; set; }

        [Input("scannerNames")]
        private InputList<string>? _scannerNames;

        /// <summary>
        /// List of scanner names
        /// </summary>
        public InputList<string> ScannerNames
        {
            get => _scannerNames ?? (_scannerNames = new InputList<string>());
            set => _scannerNames = value;
        }

        /// <summary>
        /// Scanner type
        /// </summary>
        [Input("scannerType")]
        public Input<string>? ScannerType { get; set; }

        [Input("webhooks")]
        private InputList<Inputs.GetIntegrationRegistriesWebhookInputArgs>? _webhooks;

        /// <summary>
        /// When enabled, registry events are sent to the given Aqua webhook url
        /// </summary>
        public InputList<Inputs.GetIntegrationRegistriesWebhookInputArgs> Webhooks
        {
            get => _webhooks ?? (_webhooks = new InputList<Inputs.GetIntegrationRegistriesWebhookInputArgs>());
            set => _webhooks = value;
        }

        public GetIntegrationRegistriesInvokeArgs()
        {
        }
        public static new GetIntegrationRegistriesInvokeArgs Empty => new GetIntegrationRegistriesInvokeArgs();
    }


    [OutputType]
    public sealed class GetIntegrationRegistriesResult
    {
        /// <summary>
        /// Automatically clean up that don't match the pull criteria
        /// </summary>
        public readonly bool? AdvancedSettingsCleanup;
        /// <summary>
        /// List of image patterns to pull always
        /// </summary>
        public readonly ImmutableArray<string> AlwaysPullPatterns;
        /// <summary>
        /// Automatically clean up images and repositories which are no longer present in the registry from Aqua console
        /// </summary>
        public readonly bool AutoCleanup;
        /// <summary>
        /// Whether to automatically pull images from the registry on creation and daily
        /// </summary>
        public readonly bool AutoPull;
        /// <summary>
        /// The interval in days to start pulling new images from the registry, Defaults to 1
        /// </summary>
        public readonly int AutoPullInterval;
        /// <summary>
        /// Maximum number of repositories to pull every day, defaults to 100
        /// </summary>
        public readonly int AutoPullMax;
        /// <summary>
        /// Whether to automatically pull and rescan images from the registry on creation and daily
        /// </summary>
        public readonly bool AutoPullRescan;
        /// <summary>
        /// The time of day to start pulling new images from the registry, in the format HH:MM (24-hour clock), defaults to 03:00
        /// </summary>
        public readonly string AutoPullTime;
        /// <summary>
        /// The description of the registry
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Additional condition for pulling and rescanning images, Defaults to 'none'
        /// </summary>
        public readonly string ImageCreationDateCondition;
        /// <summary>
        /// The last time the registry was modified in UNIX time
        /// </summary>
        public readonly int Lastupdate;
        /// <summary>
        /// The name of the registry; string, required - this will be treated as the registry's ID, so choose a simple alphanumerical name without special signs and spaces
        /// </summary>
        public readonly string Name;
        public readonly ImmutableArray<Outputs.GetIntegrationRegistriesOptionResult> Options;
        /// <summary>
        /// The password for registry authentication
        /// </summary>
        public readonly string Password;
        /// <summary>
        /// List of possible prefixes to image names pulled from the registry
        /// </summary>
        public readonly ImmutableArray<string> Prefixes;
        /// <summary>
        /// When auto pull image enabled, sets maximum age of auto pulled images
        /// </summary>
        public readonly string PullImageAge;
        /// <summary>
        /// When auto pull image enabled, sets maximum age of auto pulled images tags from each repository.
        /// </summary>
        public readonly int PullImageCount;
        /// <summary>
        /// List of image tags patterns to pull
        /// </summary>
        public readonly ImmutableArray<string> PullImageTagPatterns;
        /// <summary>
        /// List of image patterns to exclude
        /// </summary>
        public readonly ImmutableArray<string> PullRepoPatternsExcludeds;
        /// <summary>
        /// Registry scan timeout in Minutes
        /// </summary>
        public readonly int? RegistryScanTimeout;
        /// <summary>
        /// List of scanner names
        /// </summary>
        public readonly ImmutableArray<string> ScannerNames;
        /// <summary>
        /// Scanner type
        /// </summary>
        public readonly string ScannerType;
        /// <summary>
        /// Registry type (HUB / V1 / V2 / ACR / GAR / ENGINE / AWS / GCR).
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// The URL, address or region of the registry
        /// </summary>
        public readonly string Url;
        /// <summary>
        /// The username for registry authentication.
        /// </summary>
        public readonly string Username;
        /// <summary>
        /// When enabled, registry events are sent to the given Aqua webhook url
        /// </summary>
        public readonly ImmutableArray<Outputs.GetIntegrationRegistriesWebhookResult> Webhooks;

        [OutputConstructor]
        private GetIntegrationRegistriesResult(
            bool? advancedSettingsCleanup,

            ImmutableArray<string> alwaysPullPatterns,

            bool autoCleanup,

            bool autoPull,

            int autoPullInterval,

            int autoPullMax,

            bool autoPullRescan,

            string autoPullTime,

            string description,

            string id,

            string imageCreationDateCondition,

            int lastupdate,

            string name,

            ImmutableArray<Outputs.GetIntegrationRegistriesOptionResult> options,

            string password,

            ImmutableArray<string> prefixes,

            string pullImageAge,

            int pullImageCount,

            ImmutableArray<string> pullImageTagPatterns,

            ImmutableArray<string> pullRepoPatternsExcludeds,

            int? registryScanTimeout,

            ImmutableArray<string> scannerNames,

            string scannerType,

            string type,

            string url,

            string username,

            ImmutableArray<Outputs.GetIntegrationRegistriesWebhookResult> webhooks)
        {
            AdvancedSettingsCleanup = advancedSettingsCleanup;
            AlwaysPullPatterns = alwaysPullPatterns;
            AutoCleanup = autoCleanup;
            AutoPull = autoPull;
            AutoPullInterval = autoPullInterval;
            AutoPullMax = autoPullMax;
            AutoPullRescan = autoPullRescan;
            AutoPullTime = autoPullTime;
            Description = description;
            Id = id;
            ImageCreationDateCondition = imageCreationDateCondition;
            Lastupdate = lastupdate;
            Name = name;
            Options = options;
            Password = password;
            Prefixes = prefixes;
            PullImageAge = pullImageAge;
            PullImageCount = pullImageCount;
            PullImageTagPatterns = pullImageTagPatterns;
            PullRepoPatternsExcludeds = pullRepoPatternsExcludeds;
            RegistryScanTimeout = registryScanTimeout;
            ScannerNames = scannerNames;
            ScannerType = scannerType;
            Type = type;
            Url = url;
            Username = username;
            Webhooks = webhooks;
        }
    }
}
